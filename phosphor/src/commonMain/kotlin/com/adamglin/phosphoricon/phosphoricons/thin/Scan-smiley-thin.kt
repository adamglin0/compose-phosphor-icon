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

public val ThinGroup.`Scan-smiley-thin`: ImageVector
    get() {
        if (`_scan-smiley-thin` != null) {
            return `_scan-smiley-thin`!!
        }
        `_scan-smiley-thin` = Builder(name = "Scan-smiley-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 40.0f)
                lineTo(220.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 44.0f)
                lineTo(180.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 40.0f)
                close()
                moveTo(216.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
                moveTo(76.0f, 212.0f)
                lineTo(44.0f, 212.0f)
                lineTo(44.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(76.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(40.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(44.0f, 44.0f)
                lineTo(76.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 80.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 188.0f, 128.0f)
                close()
                moveTo(112.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 116.0f)
                close()
                moveTo(152.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 108.0f)
                close()
                moveTo(149.35f, 149.0f)
                curveToRelative(-4.52f, 4.0f, -13.7f, 7.0f, -21.35f, 7.0f)
                reflectiveCurveToRelative(-16.83f, -3.0f, -21.35f, -7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.3f, 6.0f)
                curveToRelative(6.0f, 5.3f, 17.0f, 9.0f, 26.65f, 9.0f)
                reflectiveCurveToRelative(20.64f, -3.7f, 26.65f, -9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.3f, -6.0f)
                close()
            }
        }
        .build()
        return `_scan-smiley-thin`!!
    }

private var `_scan-smiley-thin`: ImageVector? = null
