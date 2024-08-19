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

public val LightGroup.`File-c-light`: ImageVector
    get() {
        if (`_file-c-light` != null) {
            return `_file-c-light`!!
        }
        `_file-c-light` = Builder(name = "File-c-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.0f, 180.0f)
                curveToRelative(0.0f, 12.13f, 8.07f, 22.0f, 18.0f, 22.0f)
                arcToRelative(16.23f, 16.23f, 0.0f, false, false, 11.67f, -5.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.66f, 8.3f)
                arcTo(28.06f, 28.06f, 0.0f, false, true, 64.0f, 214.0f)
                curveToRelative(-16.54f, 0.0f, -30.0f, -15.25f, -30.0f, -34.0f)
                reflectiveCurveToRelative(13.46f, -34.0f, 30.0f, -34.0f)
                arcToRelative(28.06f, 28.06f, 0.0f, false, true, 20.33f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.66f, 8.3f)
                arcTo(16.23f, 16.23f, 0.0f, false, false, 64.0f, 158.0f)
                curveTo(54.07f, 158.0f, 46.0f, 167.87f, 46.0f, 180.0f)
                close()
                moveTo(214.0f, 88.0f)
                lineTo(214.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(120.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(202.0f, 94.0f)
                lineTo(152.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(146.0f, 38.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.25f, 1.76f)
                lineToRelative(56.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f)
                close()
                moveTo(158.0f, 82.0f)
                horizontalLineToRelative(35.52f)
                lineTo(158.0f, 46.48f)
                close()
            }
        }
        .build()
        return `_file-c-light`!!
    }

private var `_file-c-light`: ImageVector? = null
