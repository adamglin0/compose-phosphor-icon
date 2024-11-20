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

public val LightGroup.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 83.76f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                lineTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(176.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.76f)
                close()
                moveTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
                moveTo(108.0f, 130.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, -46.66f, 32.0f)
                lineTo(60.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, 68.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, -100.0f)
                close()
                moveTo(108.0f, 218.0f)
                lineTo(60.0f, 218.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -1.65f, -43.94f)
                curveToRelative(-0.06f, 0.47f, -0.1f, 0.93f, -0.15f, 1.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 1.08f)
                arcTo(38.57f, 38.57f, 0.0f, false, true, 71.3f, 170.0f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 0.24f, -0.86f)
                arcTo(38.0f, 38.0f, 0.0f, true, true, 108.0f, 218.0f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
