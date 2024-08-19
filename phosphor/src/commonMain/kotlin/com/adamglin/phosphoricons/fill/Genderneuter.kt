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

public val FillGroup.Genderneuter: ImageVector
    get() {
        if (_genderneuter != null) {
            return _genderneuter!!
        }
        _genderneuter = Builder(name = "Genderneuter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.84f, 108.35f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -36.19f, -36.19f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 167.84f, 108.35f)
                close()
                moveTo(216.0f, 40.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(56.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                lineTo(200.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f)
                close()
                moveTo(184.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -64.0f, 55.42f)
                verticalLineToRelative(32.31f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                lineTo(136.0f, 167.42f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 184.0f, 112.0f)
                close()
            }
        }
        .build()
        return _genderneuter!!
    }

private var _genderneuter: ImageVector? = null
