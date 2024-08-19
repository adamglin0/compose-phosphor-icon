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

public val BoldGroup.Folderstar: ImageVector
    get() {
        if (_folderstar != null) {
            return _folderstar!!
        }
        _folderstar = Builder(name = "Folderstar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.56f, 196.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(133.39f)
                lineToRelative(-26.0f, -29.29f)
                horizontalLineToRelative(0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 92.41f, 32.0f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 52.0f)
                verticalLineTo(200.62f)
                arcTo(19.41f, 19.41f, 0.0f, false, false, 39.38f, 220.0f)
                horizontalLineToRelative(73.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 56.0f)
                horizontalLineTo(90.61f)
                lineToRelative(10.67f, 12.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(243.44f, 158.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.52f, -8.34f)
                lineToRelative(-27.42f, -2.12f)
                lineTo(195.0f, 123.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.0f, 0.0f)
                lineTo(162.5f, 147.53f)
                lineToRelative(-27.42f, 2.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.72f, 21.22f)
                lineToRelative(20.58f, 17.0f)
                lineToRelative(-6.25f, 25.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.73f, 13.22f)
                lineTo(184.0f, 212.46f)
                lineToRelative(23.58f, 13.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.73f, -13.22f)
                lineToRelative(-6.25f, -25.26f)
                lineToRelative(20.58f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 243.44f, 158.0f)
                close()
                moveTo(198.0f, 174.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 12.13f)
                lineToRelative(1.21f, 4.89f)
                lineToRelative(-5.07f, -3.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -12.18f, 0.0f)
                lineToRelative(-5.07f, 3.0f)
                lineToRelative(1.21f, -4.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, -12.13f)
                lineToRelative(-3.48f, -2.87f)
                lineToRelative(5.0f, -0.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.1f, -7.21f)
                lineToRelative(2.33f, -5.4f)
                lineToRelative(2.33f, 5.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.09f, 7.21f)
                lineToRelative(5.0f, 0.39f)
                close()
            }
        }
        .build()
        return _folderstar!!
    }

private var _folderstar: ImageVector? = null
