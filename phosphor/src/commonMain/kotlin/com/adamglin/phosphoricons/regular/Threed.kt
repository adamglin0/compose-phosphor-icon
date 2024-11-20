package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.ThreeD: ImageVector
    get() {
        if (_threeD != null) {
            return _threeD!!
        }
        _threeD = Builder(name = "ThreeD", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.55f, -12.59f)
                lineTo(88.63f, 88.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.55f, 12.59f)
                lineToRelative(-21.0f, 30.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 76.0f, 184.0f)
                arcToRelative(35.71f, 35.71f, 0.0f, false, true, -25.71f, -10.81f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 61.71f, 162.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 148.0f)
                close()
                moveTo(160.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 112.0f)
                lineTo(136.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(128.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
                moveTo(160.0f, 88.0f)
                lineTo(144.0f, 88.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                close()
                moveTo(32.0f, 56.0f)
                lineTo(224.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(32.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _threeD!!
    }

private var _threeD: ImageVector? = null
