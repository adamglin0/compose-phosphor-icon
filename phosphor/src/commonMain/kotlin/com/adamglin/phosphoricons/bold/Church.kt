package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.17f, 141.71f)
                lineTo(196.0f, 121.21f)
                lineTo(196.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 190.0f, 93.58f)
                lineTo(140.0f, 65.0f)
                lineTo(140.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 28.0f)
                lineTo(140.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 28.0f)
                lineTo(104.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(116.0f, 65.0f)
                lineTo(66.05f, 93.58f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 104.0f)
                verticalLineToRelative(17.21f)
                lineToRelative(-34.17f, 20.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(120.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 230.17f, 141.71f)
                close()
                moveTo(44.0f, 158.79f)
                lineToRelative(16.0f, -9.6f)
                lineTo(60.0f, 204.0f)
                lineTo(44.0f, 204.0f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                lineTo(84.0f, 204.0f)
                lineTo(84.0f, 111.0f)
                lineToRelative(44.0f, -25.14f)
                lineTo(172.0f, 111.0f)
                verticalLineToRelative(93.0f)
                lineTo(160.0f, 204.0f)
                lineTo(160.0f, 172.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 140.0f)
                close()
                moveTo(212.0f, 204.0f)
                lineTo(196.0f, 204.0f)
                lineTo(196.0f, 149.19f)
                lineToRelative(16.0f, 9.6f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
