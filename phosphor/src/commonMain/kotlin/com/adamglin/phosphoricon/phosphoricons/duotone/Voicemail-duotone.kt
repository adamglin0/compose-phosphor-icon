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

public val DuotoneGroup.`Voicemail-duotone`: ImageVector
    get() {
        if (`_voicemail-duotone` != null) {
            return `_voicemail-duotone`!!
        }
        `_voicemail-duotone` = Builder(name = "Voicemail-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(104.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 56.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
                moveTo(200.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 200.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -39.14f, 96.0f)
                lineTo(95.14f, 168.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 56.0f, 184.0f)
                lineTo(200.0f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
                moveTo(16.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 16.0f, 128.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 200.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_voicemail-duotone`!!
    }

private var `_voicemail-duotone`: ImageVector? = null
