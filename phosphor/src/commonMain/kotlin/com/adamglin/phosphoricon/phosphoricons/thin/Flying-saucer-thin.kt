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

public val ThinGroup.`Flying-saucer-thin`: ImageVector
    get() {
        if (`_flying-saucer-thin` != null) {
            return `_flying-saucer-thin`!!
        }
        `_flying-saucer-thin` = Builder(name = "Flying-saucer-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.79f, 214.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.53f, 5.06f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 176.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.73f)
                lineToRelative(-8.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.58f, -2.54f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
                moveTo(89.26f, 188.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.05f, 2.53f)
                lineToRelative(-8.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.58f, 2.54f)
                lineToRelative(8.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 89.26f, 188.2f)
                close()
                moveTo(244.0f, 112.0f)
                curveToRelative(0.0f, 29.16f, -50.95f, 52.0f, -116.0f, 52.0f)
                reflectiveCurveTo(12.0f, 141.16f, 12.0f, 112.0f)
                curveToRelative(0.0f, -20.31f, 24.8f, -38.16f, 64.84f, -46.8f)
                arcToRelative(59.65f, 59.65f, 0.0f, false, true, 93.31f, -11.9f)
                arcToRelative(60.91f, 60.91f, 0.0f, false, true, 9.42f, 12.0f)
                curveTo(219.36f, 74.0f, 244.0f, 91.77f, 244.0f, 112.0f)
                close()
                moveTo(76.0f, 96.83f)
                verticalLineToRelative(3.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.24f, 11.64f)
                arcTo(192.0f, 192.0f, 0.0f, false, false, 128.0f, 116.0f)
                arcToRelative(192.0f, 192.0f, 0.0f, false, false, 42.75f, -4.48f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 180.0f, 99.88f)
                lineTo(180.0f, 96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.69f, -52.0f)
                curveTo(99.0f, 44.37f, 76.0f, 68.07f, 76.0f, 96.83f)
                close()
                moveTo(236.0f, 112.0f)
                curveToRelative(0.0f, -15.0f, -20.13f, -29.37f, -51.94f, -37.43f)
                arcTo(59.9f, 59.9f, 0.0f, false, true, 188.0f, 96.0f)
                verticalLineToRelative(3.91f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, true, -15.45f, 19.41f)
                arcTo(199.69f, 199.69f, 0.0f, false, true, 128.0f, 124.0f)
                arcToRelative(199.69f, 199.69f, 0.0f, false, true, -44.54f, -4.68f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 68.0f, 99.91f)
                horizontalLineToRelative(0.0f)
                lineTo(68.0f, 96.85f)
                arcToRelative(60.91f, 60.91f, 0.0f, false, true, 4.25f, -22.36f)
                curveTo(40.25f, 82.54f, 20.0f, 96.88f, 20.0f, 112.0f)
                curveToRelative(0.0f, 23.85f, 49.46f, 44.0f, 108.0f, 44.0f)
                reflectiveCurveTo(236.0f, 135.85f, 236.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_flying-saucer-thin`!!
    }

private var `_flying-saucer-thin`: ImageVector? = null
