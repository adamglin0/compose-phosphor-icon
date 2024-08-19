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

public val LightGroup.Filezip: ImageVector
    get() {
        if (_filezip != null) {
            return _filezip!!
        }
        _filezip = Builder(name = "Filezip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 146.0f)
                lineTo(168.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 198.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f)
                close()
                moveTo(184.0f, 186.0f)
                lineTo(174.0f, 186.0f)
                lineTo(174.0f, 158.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f)
                close()
                moveTo(134.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(94.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.21f, -9.0f)
                lineToRelative(26.87f, -47.0f)
                lineTo(56.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(88.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.21f, 9.0f)
                lineTo(66.34f, 202.0f)
                lineTo(88.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 94.0f, 208.0f)
                close()
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
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.76f)
                close()
                moveTo(158.0f, 82.0f)
                lineTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                close()
            }
        }
        .build()
        return _filezip!!
    }

private var _filezip: ImageVector? = null
