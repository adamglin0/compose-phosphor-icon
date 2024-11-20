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

public val BoldGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.41f, 155.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.56f, -0.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 139.0f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 202.8f, 124.0f)
                arcToRelative(15.83f, 15.83f, 0.0f, false, true, 8.0f, 1.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 114.7f)
                verticalLineTo(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(176.0f)
                arcToRelative(40.15f, 40.15f, 0.0f, false, false, -12.62f, -29.16f)
                arcToRelative(39.67f, 39.67f, 0.0f, false, false, -29.94f, -10.76f)
                arcToRelative(40.08f, 40.08f, 0.0f, false, false, -37.34f, 37.0f)
                curveTo(96.0f, 50.07f, 96.0f, 51.0f, 96.0f, 52.0f)
                horizontalLineTo(64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 72.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(40.15f, 40.15f, 0.0f, false, false, -29.16f, 12.62f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 41.1f, 179.9f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, false, 2.9f, 0.1f)
                verticalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(165.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 222.41f, 155.16f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(165.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.15f, -10.84f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 42.8f, 156.0f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 28.0f, 141.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.82f, -15.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 114.7f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(42.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.83f, -17.15f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 120.0f, 50.8f)
                arcTo(16.19f, 16.19f, 0.0f, false, true, 134.94f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.53f, 22.81f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 161.31f, 76.0f)
                horizontalLineTo(204.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(-1.0f, 0.0f, -1.93f, 0.0f, -2.9f, 0.11f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 204.0f, 180.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
