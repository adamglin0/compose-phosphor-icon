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

public val ThinGroup.`Toilet-thin`: ImageVector
    get() {
        if (`_toilet-thin` != null) {
            return `_toilet-thin`!!
        }
        `_toilet-thin` = Builder(name = "Toilet-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 64.0f)
                close()
                moveTo(168.0f, 194.86f)
                lineTo(171.92f, 222.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 236.0f)
                lineTo(96.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.88f, -13.7f)
                lineTo(88.0f, 194.86f)
                arcTo(92.11f, 92.11f, 0.0f, false, true, 36.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(60.0f, 108.0f)
                lineTo(60.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 28.0f)
                lineTo(184.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcTo(92.11f, 92.11f, 0.0f, false, true, 168.0f, 194.86f)
                close()
                moveTo(68.0f, 108.0f)
                lineTo(188.0f, 108.0f)
                lineTo(188.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(72.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(160.34f, 198.13f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -64.68f, 0.0f)
                lineTo(92.0f, 223.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.94f, 3.19f)
                arcTo(3.93f, 3.93f, 0.0f, false, false, 96.0f, 228.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, 3.0f, -1.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.94f, -3.19f)
                close()
                moveTo(211.91f, 116.0f)
                lineTo(44.09f, 116.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 167.82f, 0.0f)
                close()
            }
        }
        .build()
        return `_toilet-thin`!!
    }

private var `_toilet-thin`: ImageVector? = null
