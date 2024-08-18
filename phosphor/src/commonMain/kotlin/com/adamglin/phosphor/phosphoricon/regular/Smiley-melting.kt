package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Smiley-melting`: ImageVector
    get() {
        if (`_smiley-melting` != null) {
            return `_smiley-melting`!!
        }
        `_smiley-melting` = Builder(name = "Smiley-melting", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(201.0f, 54.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 50.48f, 197.33f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 62.4f, 186.66f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 131.19f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.93f, 10.67f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.0f, 54.0f)
                close()
                moveTo(152.0f, 168.0f)
                lineTo(136.0f, 168.0f)
                curveToRelative(-21.74f, 0.0f, -48.0f, -17.84f, -48.0f, -40.0f)
                arcToRelative(41.33f, 41.33f, 0.0f, false, true, 0.55f, -6.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.78f, -2.64f)
                arcTo(56.9f, 56.9f, 0.0f, false, false, 72.0f, 128.0f)
                curveToRelative(0.0f, 14.88f, 7.46f, 29.13f, 21.0f, 40.15f)
                curveTo(105.4f, 178.22f, 121.07f, 184.0f, 136.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return `_smiley-melting`!!
    }

private var `_smiley-melting`: ImageVector? = null
