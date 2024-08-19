package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Boules-duotone`: ImageVector
    get() {
        if (`_boules-duotone` != null) {
            return `_boules-duotone`!!
        }
        `_boules-duotone` = Builder(name = "Boules-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(215.52f, 88.48f)
                lineToRelative(-127.0f, 127.0f)
                arcToRelative(96.47f, 96.47f, 0.0f, false, true, -48.0f, -48.0f)
                lineToRelative(127.0f, -127.0f)
                arcTo(96.47f, 96.47f, 0.0f, false, true, 215.52f, 88.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(184.28f, 60.41f)
                lineTo(60.4f, 184.28f)
                arcTo(88.33f, 88.33f, 0.0f, false, true, 50.21f, 169.1f)
                lineTo(169.1f, 50.21f)
                arcTo(87.8f, 87.8f, 0.0f, false, true, 184.28f, 60.41f)
                close()
                moveTo(195.59f, 71.72f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, 10.2f, 15.18f)
                lineTo(86.9f, 205.79f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -15.18f, -10.2f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(87.81f, 87.81f, 0.0f, false, true, 25.05f, 3.64f)
                lineTo(43.64f, 153.05f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.81f, 87.81f, 0.0f, false, true, -25.0f, -3.64f)
                lineTo(212.36f, 103.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_boules-duotone`!!
    }

private var `_boules-duotone`: ImageVector? = null
