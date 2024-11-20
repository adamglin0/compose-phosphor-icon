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

public val ThinGroup.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) {
            return _speakerNone!!
        }
        _speakerNone = Builder(name = "SpeakerNone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.76f, 28.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.22f, 0.43f)
                lineTo(78.63f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(78.63f, 172.0f)
                lineToRelative(70.91f, 55.16f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 152.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.76f, -0.41f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 156.0f, 224.0f)
                lineTo(156.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 153.76f, 28.41f)
                close()
                moveTo(28.0f, 160.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 92.0f)
                verticalLineToRelative(72.0f)
                lineTo(32.0f, 164.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 160.0f)
                close()
                moveTo(148.0f, 215.82f)
                lineTo(84.0f, 166.0f)
                lineTo(84.0f, 90.0f)
                lineToRelative(64.0f, -49.78f)
                close()
            }
        }
        .build()
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
