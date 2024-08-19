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

public val DuotoneGroup.`Less-than-or-equal-duotone`: ImageVector
    get() {
        if (`_less-than-or-equal-duotone` != null) {
            return `_less-than-or-equal-duotone`!!
        }
        `_less-than-or-equal-duotone` = Builder(name = "Less-than-or-equal-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 48.0f)
                verticalLineTo(160.0f)
                lineTo(48.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.23f, -7.5f)
                lineToRelative(152.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.53f, 15.0f)
                lineTo(71.14f, 104.0f)
                lineToRelative(131.62f, 48.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 168.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -2.77f, -0.49f)
                lineToRelative(-152.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 104.0f)
                close()
                moveTo(200.0f, 192.0f)
                lineTo(48.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(200.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_less-than-or-equal-duotone`!!
    }

private var `_less-than-or-equal-duotone`: ImageVector? = null
