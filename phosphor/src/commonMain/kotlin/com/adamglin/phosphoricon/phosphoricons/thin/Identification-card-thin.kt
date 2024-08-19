package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Identification-card-thin`: ImageVector
    get() {
        if (`_identification-card-thin` != null) {
            return `_identification-card-thin`!!
        }
        `_identification-card-thin` = Builder(name = "Identification-card-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 112.0f)
                close()
                moveTo(192.0f, 140.0f)
                lineTo(152.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(220.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(131.87f, 167.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.74f, 2.0f)
                curveTo(121.06f, 157.0f, 109.0f, 148.0f, 96.0f, 148.0f)
                reflectiveCurveToRelative(-25.0f, 9.0f, -28.13f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 172.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.0f, -0.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 60.13f, 167.0f)
                arcToRelative(36.28f, 36.28f, 0.0f, false, true, 20.43f, -23.66f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 30.88f, 0.0f)
                arcTo(36.2f, 36.2f, 0.0f, false, true, 131.87f, 167.0f)
                close()
                moveTo(96.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_identification-card-thin`!!
    }

private var `_identification-card-thin`: ImageVector? = null
