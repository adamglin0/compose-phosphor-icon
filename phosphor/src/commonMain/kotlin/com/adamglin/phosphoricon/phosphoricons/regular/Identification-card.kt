package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Identification-card`: ImageVector
    get() {
        if (`_identification-card` != null) {
            return `_identification-card`!!
        }
        `_identification-card` = Builder(name = "Identification-card", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(152.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 112.0f)
                close()
                moveTo(192.0f, 136.0f)
                lineTo(152.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 200.0f)
                lineTo(216.0f, 200.0f)
                close()
                moveTo(135.74f, 166.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.5f, 4.0f)
                curveToRelative(-2.63f, -10.26f, -13.06f, -18.0f, -24.25f, -18.0f)
                reflectiveCurveToRelative(-21.61f, 7.74f, -24.25f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.5f, -4.0f)
                arcToRelative(39.84f, 39.84f, 0.0f, false, true, 17.19f, -23.34f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.12f, 0.0f)
                arcTo(39.76f, 39.76f, 0.0f, false, true, 135.75f, 166.0f)
                close()
                moveTo(96.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_identification-card`!!
    }

private var `_identification-card`: ImageVector? = null
