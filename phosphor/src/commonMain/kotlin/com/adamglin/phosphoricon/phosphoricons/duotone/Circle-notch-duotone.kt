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

public val DuotoneGroup.`Circle-notch-duotone`: ImageVector
    get() {
        if (`_circle-notch-duotone` != null) {
            return `_circle-notch-duotone`!!
        }
        `_circle-notch-duotone` = Builder(name = "Circle-notch-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -208.0f, 0.0f)
                curveToRelative(0.0f, -41.0f, 23.81f, -78.36f, 60.66f, -95.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.68f, 14.54f)
                curveTo(60.15f, 61.59f, 40.0f, 93.27f, 40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveToRelative(0.0f, -34.73f, -20.15f, -66.41f, -51.34f, -80.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.68f, -14.54f)
                curveTo(208.19f, 49.64f, 232.0f, 87.0f, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_circle-notch-duotone`!!
    }

private var `_circle-notch-duotone`: ImageVector? = null
