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

public val BoldGroup.Fastforwardcircle: ImageVector
    get() {
        if (_fastforwardcircle != null) {
            return _fastforwardcircle!!
        }
        _fastforwardcircle = Builder(name = "Fastforwardcircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.5f, 9.37f)
                lineToRelative(-40.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 132.0f, 160.0f)
                lineTo(132.0f, 140.17f)
                lineToRelative(-36.5f, 29.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 160.0f)
                lineTo(76.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.5f, -9.37f)
                lineToRelative(36.5f, 29.2f)
                lineTo(132.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.5f, -9.37f)
                lineToRelative(40.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.0f, 128.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _fastforwardcircle!!
    }

private var _fastforwardcircle: ImageVector? = null
