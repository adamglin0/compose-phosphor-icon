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

public val LightGroup.Puzzlepiece: ImageVector
    get() {
        if (_puzzlepiece != null) {
            return _puzzlepiece!!
        }
        _puzzlepiece = Builder(name = "Puzzlepiece", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.21f, 160.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.78f, -0.35f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -11.05f, -41.83f)
                arcToRelative(22.15f, 22.15f, 0.0f, false, true, 11.05f, 2.06f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 114.7f)
                verticalLineTo(72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(169.48f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, false, 0.52f, -6.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, -10.73f, -24.78f)
                arcToRelative(33.64f, 33.64f, 0.0f, false, false, -25.45f, -9.15f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 102.54f, 58.0f)
                horizontalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 72.0f)
                verticalLineToRelative(34.53f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -30.79f, 10.2f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 22.31f, 57.18f)
                arcToRelative(34.34f, 34.34f, 0.0f, false, false, 8.48f, -0.44f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(165.31f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 219.21f, 160.24f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(165.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -2.57f, 0.58f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -31.38f, -18.46f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 31.38f, -21.31f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 62.0f, 114.7f)
                verticalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(46.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.42f, -8.57f)
                arcToRelative(22.25f, 22.25f, 0.0f, false, true, -2.0f, -11.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 41.83f, 11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 161.3f, 70.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(34.54f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -39.93f, 31.28f)
                arcToRelative(33.71f, 33.71f, 0.0f, false, false, 9.14f, 25.45f)
                arcTo(34.15f, 34.15f, 0.0f, false, false, 210.0f, 173.48f)
                close()
            }
        }
        .build()
        return _puzzlepiece!!
    }

private var _puzzlepiece: ImageVector? = null
