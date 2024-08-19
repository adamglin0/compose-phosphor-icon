package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Puzzlepiece: ImageVector
    get() {
        if (_puzzlepiece != null) {
            return _puzzlepiece!!
        }
        _puzzlepiece = Builder(name = "Puzzlepiece", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.78f, 224.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(170.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.94f, 163.0f)
                arcToRelative(23.37f, 23.37f, 0.0f, false, true, -8.94f, 1.77f)
                curveToRelative(-13.23f, 0.0f, -24.0f, -11.1f, -24.0f, -24.73f)
                reflectiveCurveToRelative(10.77f, -24.73f, 24.0f, -24.73f)
                arcToRelative(23.37f, 23.37f, 0.0f, false, true, 8.94f, 1.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 109.65f)
                verticalLineTo(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(171.78f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, 0.22f, -4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, 0.22f, 4.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                verticalLineToRelative(32.22f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, -4.0f, -0.22f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                arcToRelative(35.36f, 35.36f, 0.0f, false, false, 4.0f, -0.22f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(42.22f)
            }
        }
        .build()
        return _puzzlepiece!!
    }

private var _puzzlepiece: ImageVector? = null
