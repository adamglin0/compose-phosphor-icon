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

public val FillGroup.Squaresplithorizontal: ImageVector
    get() {
        if (_squaresplithorizontal != null) {
            return _squaresplithorizontal!!
        }
        _squaresplithorizontal = Builder(name = "Squaresplithorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 44.0f)
                lineTo(120.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(40.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 40.0f)
                horizontalLineToRelative(60.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 44.0f)
                close()
                moveTo(200.0f, 40.0f)
                lineTo(140.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(136.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
            }
        }
        .build()
        return _squaresplithorizontal!!
    }

private var _squaresplithorizontal: ImageVector? = null
