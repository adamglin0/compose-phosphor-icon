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

public val BoldGroup.Skipbackcircle: ImageVector
    get() {
        if (_skipbackcircle != null) {
            return _skipbackcircle!!
        }
        _skipbackcircle = Builder(name = "Skipbackcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(165.82f, 77.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, 0.32f)
                lineTo(108.0f, 106.35f)
                lineTo(108.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(108.0f, 149.65f)
                lineToRelative(45.64f, 28.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 168.0f)
                lineTo(172.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 165.82f, 77.5f)
                close()
                moveTo(148.0f, 146.35f)
                lineTo(118.64f, 128.0f)
                lineTo(148.0f, 109.65f)
                close()
            }
        }
        .build()
        return _skipbackcircle!!
    }

private var _skipbackcircle: ImageVector? = null
