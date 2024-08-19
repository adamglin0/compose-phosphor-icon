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

public val LightGroup.`Person-simple-light`: ImageVector
    get() {
        if (`_person-simple-light` != null) {
            return `_person-simple-light`!!
        }
        `_person-simple-light` = Builder(name = "Person-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 78.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 48.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 78.0f)
                close()
                moveTo(128.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 30.0f)
                close()
                moveTo(229.14f, 131.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.23f, 2.0f)
                curveToRelative(-0.37f, -0.21f, -36.49f, -21.43f, -86.91f, -23.0f)
                verticalLineToRelative(39.61f)
                lineTo(196.48f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, 8.0f)
                lineTo(128.0f, 161.0f)
                lineTo(68.48f, 228.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -8.0f)
                lineTo(122.0f, 149.72f)
                lineTo(122.0f, 110.11f)
                curveToRelative(-50.42f, 1.6f, -86.55f, 22.82f, -86.92f, 23.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.17f, -10.29f)
                curveTo(30.6f, 121.84f, 71.0f, 98.0f, 128.0f, 98.0f)
                reflectiveCurveToRelative(97.39f, 23.84f, 99.09f, 24.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 229.14f, 131.09f)
                close()
            }
        }
        .build()
        return `_person-simple-light`!!
    }

private var `_person-simple-light`: ImageVector? = null
