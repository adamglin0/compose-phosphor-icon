package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) {
            return _speakerX!!
        }
        _speakerX = Builder(name = "SpeakerX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.64f, 26.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.32f, 0.65f)
                lineTo(77.94f, 82.0f)
                lineTo(32.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(77.94f, 174.0f)
                lineToRelative(70.38f, 54.74f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.0f, 224.0f)
                lineTo(158.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 154.64f, 26.61f)
                close()
                moveTo(30.0f, 160.0f)
                lineTo(30.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 94.0f)
                verticalLineToRelative(68.0f)
                lineTo(32.0f, 162.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 160.0f)
                close()
                moveTo(146.0f, 211.73f)
                lineTo(86.0f, 165.06f)
                lineTo(86.0f, 90.94f)
                lineToRelative(60.0f, -46.67f)
                close()
                moveTo(244.24f, 147.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(216.0f, 136.48f)
                lineToRelative(-19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(207.52f, 128.0f)
                lineToRelative(-19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(216.0f, 119.52f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(224.48f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
