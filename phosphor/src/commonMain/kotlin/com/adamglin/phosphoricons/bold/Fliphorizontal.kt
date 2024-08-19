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

public val BoldGroup.Fliphorizontal: ImageVector
    get() {
        if (_fliphorizontal != null) {
            return _fliphorizontal!!
        }
        _fliphorizontal = Builder(name = "Fliphorizontal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 20.41f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, -22.4f, 11.81f)
                curveToRelative(-0.07f, 0.15f, -0.13f, 0.31f, -0.19f, 0.46f)
                lineTo(21.47f, 192.49f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 220.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(120.0f, 40.0f)
                arcTo(19.83f, 19.83f, 0.0f, false, false, 104.0f, 20.41f)
                close()
                moveTo(96.0f, 196.0f)
                lineTo(45.79f, 196.0f)
                lineTo(96.0f, 62.09f)
                close()
                moveTo(234.53f, 192.49f)
                lineTo(174.61f, 32.68f)
                curveToRelative(-0.06f, -0.15f, -0.12f, -0.31f, -0.19f, -0.46f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 136.0f, 40.0f)
                lineTo(136.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.54f, -27.51f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(160.0f, 62.09f)
                lineTo(210.21f, 196.0f)
                close()
            }
        }
        .build()
        return _fliphorizontal!!
    }

private var _fliphorizontal: ImageVector? = null
