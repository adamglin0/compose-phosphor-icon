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

public val ThinGroup.`Bell-thin`: ImageVector
    get() {
        if (`_bell-thin` != null) {
            return `_bell-thin`!!
        }
        `_bell-thin` = Builder(name = "Bell-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.35f, 178.0f)
                curveTo(212.58f, 168.0f, 204.0f, 140.13f, 204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -152.0f, 0.0f)
                curveToRelative(0.0f, 36.13f, -8.59f, 64.0f, -14.36f, 73.95f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 196.0f)
                lineTo(92.23f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 71.54f, 0.0f)
                lineTo(208.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 218.35f, 178.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.71f, -24.0f)
                horizontalLineToRelative(55.42f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(211.45f, 186.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -3.44f, 2.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -3.44f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.0f)
                curveTo(52.0f, 169.17f, 60.0f, 139.32f, 60.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 136.0f, 0.0f)
                curveToRelative(0.0f, 35.31f, 8.0f, 65.17f, 15.44f, 78.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.45f, 186.0f)
                close()
            }
        }
        .build()
        return `_bell-thin`!!
    }

private var `_bell-thin`: ImageVector? = null
