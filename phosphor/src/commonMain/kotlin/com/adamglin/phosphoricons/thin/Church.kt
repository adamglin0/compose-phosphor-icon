package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.06f, 148.57f)
                lineTo(188.0f, 125.74f)
                lineTo(188.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -3.47f)
                lineTo(132.0f, 69.68f)
                lineTo(132.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 36.0f)
                lineTo(132.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 36.0f)
                lineTo(104.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(124.0f, 69.68f)
                lineTo(70.0f, 100.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 68.0f, 104.0f)
                verticalLineToRelative(21.74f)
                lineTo(29.94f, 148.57f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(116.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.06f, 148.57f)
                close()
                moveTo(36.0f, 154.26f)
                lineToRelative(32.0f, -19.2f)
                lineTo(68.0f, 212.0f)
                lineTo(36.0f, 212.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                lineTo(76.0f, 212.0f)
                lineTo(76.0f, 106.32f)
                lineToRelative(52.0f, -29.71f)
                lineToRelative(52.0f, 29.71f)
                lineTo(180.0f, 212.0f)
                lineTo(148.0f, 212.0f)
                lineTo(148.0f, 168.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(220.0f, 212.0f)
                lineTo(188.0f, 212.0f)
                lineTo(188.0f, 135.06f)
                lineToRelative(32.0f, 19.2f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
