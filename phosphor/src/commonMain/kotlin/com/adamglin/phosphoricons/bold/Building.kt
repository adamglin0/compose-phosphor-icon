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

public val BoldGroup.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 220.0f)
                lineTo(212.0f, 220.0f)
                lineTo(212.0f, 36.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(44.0f, 220.0f)
                lineTo(24.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(68.0f, 36.0f)
                lineTo(188.0f, 36.0f)
                lineTo(188.0f, 220.0f)
                lineTo(164.0f, 220.0f)
                lineTo(164.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(104.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(36.0f)
                lineTo(68.0f, 220.0f)
                close()
                moveTo(140.0f, 220.0f)
                lineTo(116.0f, 220.0f)
                lineTo(116.0f, 196.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(84.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 64.0f)
                close()
                moveTo(136.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(148.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 64.0f)
                close()
                moveTo(84.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 92.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 104.0f)
                close()
                moveTo(136.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(148.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 104.0f)
                close()
                moveTo(84.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 156.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 144.0f)
                close()
                moveTo(136.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(148.0f, 156.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 144.0f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
