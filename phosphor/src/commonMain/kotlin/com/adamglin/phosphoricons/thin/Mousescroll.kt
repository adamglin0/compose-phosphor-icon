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

public val ThinGroup.Mousescroll: ImageVector
    get() {
        if (_mousescroll != null) {
            return _mousescroll!!
        }
        _mousescroll = Builder(name = "Mousescroll", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 20.0f)
                lineTo(112.0f, 20.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 52.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f)
                lineTo(204.0f, 80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 144.0f, 20.0f)
                close()
                moveTo(196.0f, 176.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, 52.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                lineTo(60.0f, 80.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, 52.0f, -52.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, 52.0f, 52.0f)
                close()
                moveTo(132.0f, 73.66f)
                lineTo(132.0f, 182.34f)
                lineToRelative(17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(124.0f, 182.34f)
                lineTo(124.0f, 73.66f)
                lineTo(106.83f, 90.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _mousescroll!!
    }

private var _mousescroll: ImageVector? = null
