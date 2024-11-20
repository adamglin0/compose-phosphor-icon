package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(204.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 12.0f, -2.69f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(165.31f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, -50.62f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(46.69f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 50.61f, 0.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(42.69f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 204.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.27f, 158.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.7f, -0.46f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -36.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 114.69f)
                verticalLineTo(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(171.78f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, 0.22f, -4.0f)
                arcToRelative(36.15f, 36.15f, 0.0f, false, false, -11.36f, -26.25f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -60.55f, 23.63f)
                arcToRelative(36.56f, 36.56f, 0.0f, false, false, 0.14f, 6.62f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                verticalLineToRelative(32.22f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, -4.0f, -0.22f)
                arcToRelative(36.12f, 36.12f, 0.0f, false, false, -26.24f, 11.36f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, -9.69f, 27.0f)
                arcToRelative(36.08f, 36.08f, 0.0f, false, false, 33.31f, 33.6f)
                arcToRelative(36.56f, 36.56f, 0.0f, false, false, 6.62f, -0.14f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(165.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 220.27f, 158.54f)
                close()
                moveTo(208.0f, 208.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(165.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.43f, -7.23f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -36.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 114.69f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(46.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.23f, -11.43f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 36.16f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 161.31f, 72.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(32.23f)
                arcToRelative(35.68f, 35.68f, 0.0f, false, false, -6.62f, -0.14f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 204.0f, 176.0f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, 4.0f, -0.22f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
