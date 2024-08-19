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

public val ThinGroup.Puzzlepiece: ImageVector
    get() {
        if (_puzzlepiece != null) {
            return _puzzlepiece!!
        }
        _puzzlepiece = Builder(name = "Puzzlepiece", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.14f, 161.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.86f, -0.24f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.23f, -23.25f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 34.23f, -20.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 114.7f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(167.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -62.91f, -10.33f)
                arcTo(32.57f, 32.57f, 0.0f, false, false, 105.0f, 60.0f)
                horizontalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 72.0f)
                verticalLineToRelative(37.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -10.33f, 62.91f)
                arcTo(32.28f, 32.28f, 0.0f, false, false, 52.0f, 171.0f)
                verticalLineToRelative(37.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(165.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 218.14f, 161.93f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(165.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.86f, -3.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.85f, -0.24f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.24f, -20.13f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 34.24f, -23.25f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 114.7f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(46.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.62f, -5.71f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 20.13f, -34.24f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 23.25f, 34.24f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 161.31f, 68.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(37.0f)
                arcToRelative(32.57f, 32.57f, 0.0f, false, false, -10.33f, -0.94f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 212.0f, 171.0f)
                close()
            }
        }
        .build()
        return _puzzlepiece!!
    }

private var _puzzlepiece: ImageVector? = null
