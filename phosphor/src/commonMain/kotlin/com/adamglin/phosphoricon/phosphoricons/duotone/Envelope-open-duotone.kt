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

public val DuotoneGroup.`Envelope-open-duotone`: ImageVector
    get() {
        if (`_envelope-open-duotone` != null) {
            return `_envelope-open-duotone`!!
        }
        `_envelope-open-duotone` = Builder(name = "Envelope-open-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                lineToRelative(-78.55f, 56.0f)
                horizontalLineToRelative(-34.9f)
                lineTo(32.0f, 96.0f)
                lineToRelative(96.0f, -64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.44f, 89.34f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 96.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.44f, 89.34f)
                close()
                moveTo(96.72f, 152.0f)
                lineTo(40.0f, 192.0f)
                lineTo(40.0f, 111.53f)
                close()
                moveTo(113.09f, 160.0f)
                horizontalLineToRelative(29.82f)
                lineToRelative(56.63f, 40.0f)
                lineTo(56.46f, 200.0f)
                close()
                moveTo(159.28f, 152.0f)
                lineTo(216.0f, 111.53f)
                lineTo(216.0f, 192.0f)
                close()
                moveTo(128.0f, 41.61f)
                lineToRelative(81.91f, 54.61f)
                lineToRelative(-67.0f, 47.78f)
                lineTo(113.11f, 144.0f)
                lineToRelative(-67.0f, -47.78f)
                close()
            }
        }
        .build()
        return `_envelope-open-duotone`!!
    }

private var `_envelope-open-duotone`: ImageVector? = null
