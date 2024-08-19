package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Medium-logo-light`: ImageVector
    get() {
        if (`_medium-logo-light` != null) {
            return `_medium-logo-light`!!
        }
        `_medium-logo-light` = Builder(name = "Medium-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 66.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, false, 62.0f, 62.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 72.0f, 66.0f)
                close()
                moveTo(72.0f, 178.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 50.0f, -50.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 72.0f, 178.0f)
                close()
                moveTo(184.0f, 66.0f)
                curveToRelative(-17.1f, 0.0f, -30.0f, 26.65f, -30.0f, 62.0f)
                reflectiveCurveToRelative(12.9f, 62.0f, 30.0f, 62.0f)
                reflectiveCurveToRelative(30.0f, -26.65f, 30.0f, -62.0f)
                reflectiveCurveTo(201.1f, 66.0f, 184.0f, 66.0f)
                close()
                moveTo(184.0f, 178.0f)
                curveToRelative(-7.34f, 0.0f, -18.0f, -19.48f, -18.0f, -50.0f)
                reflectiveCurveToRelative(10.66f, -50.0f, 18.0f, -50.0f)
                reflectiveCurveToRelative(18.0f, 19.48f, 18.0f, 50.0f)
                reflectiveCurveTo(191.34f, 178.0f, 184.0f, 178.0f)
                close()
                moveTo(246.0f, 72.0f)
                lineTo(246.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(234.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_medium-logo-light`!!
    }

private var `_medium-logo-light`: ImageVector? = null
