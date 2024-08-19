package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Filemd: ImageVector
    get() {
        if (_filemd != null) {
            return _filemd!!
        }
        _filemd = Builder(name = "Filemd", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 83.76f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                lineTo(202.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.76f)
                close()
                moveTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
                moveTo(144.0f, 146.0f)
                lineTo(128.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, -68.0f)
                close()
                moveTo(144.0f, 202.0f)
                lineTo(134.0f, 202.0f)
                lineTo(134.0f, 158.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                close()
                moveTo(102.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(90.0f, 171.0f)
                lineTo(72.92f, 195.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.84f, 0.0f)
                lineTo(46.0f, 171.0f)
                verticalLineToRelative(37.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.92f, -3.44f)
                lineToRelative(23.08f, 33.0f)
                lineToRelative(23.08f, -33.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 152.0f)
                close()
            }
        }
        .build()
        return _filemd!!
    }

private var _filemd: ImageVector? = null
