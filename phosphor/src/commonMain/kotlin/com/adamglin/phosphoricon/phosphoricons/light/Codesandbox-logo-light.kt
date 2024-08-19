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

public val LightGroup.`Codesandbox-logo-light`: ImageVector
    get() {
        if (`_codesandbox-logo-light` != null) {
            return `_codesandbox-logo-light`!!
        }
        `_codesandbox-logo-light` = Builder(name = "Codesandbox-logo-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.72f, 67.91f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.44f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.28f, 12.28f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 13.44f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 175.82f)
                lineTo(230.0f, 80.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 222.72f, 67.91f)
                close()
                moveTo(128.0f, 121.16f)
                lineTo(44.49f, 75.44f)
                lineTo(83.14f, 54.29f)
                lineToRelative(42.0f, 23.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.76f, 0.0f)
                lineToRelative(42.0f, -23.0f)
                lineToRelative(38.65f, 21.15f)
                close()
                moveTo(127.0f, 30.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 0.0f)
                lineToRelative(31.4f, 17.2f)
                lineTo(128.0f, 65.16f)
                lineTo(95.63f, 47.45f)
                close()
                moveTo(38.0f, 175.82f)
                verticalLineToRelative(-40.0f)
                lineToRelative(36.0f, 19.7f)
                verticalLineToRelative(41.16f)
                lineTo(39.0f, 177.57f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 175.82f)
                close()
                moveTo(86.0f, 203.28f)
                lineTo(86.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.12f, -5.26f)
                lineTo(38.0f, 122.17f)
                lineTo(38.0f, 85.57f)
                lineToRelative(84.0f, 46.0f)
                lineTo(122.0f, 223.0f)
                close()
                moveTo(134.0f, 223.0f)
                lineTo(134.0f, 131.56f)
                lineToRelative(84.0f, -46.0f)
                verticalLineToRelative(36.6f)
                lineToRelative(-44.88f, 24.57f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 170.0f, 152.0f)
                verticalLineToRelative(51.28f)
                close()
                moveTo(217.0f, 177.58f)
                lineTo(182.0f, 196.72f)
                lineTo(182.0f, 155.55f)
                lineToRelative(36.0f, -19.7f)
                verticalLineToRelative(40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.0f, 177.57f)
                close()
            }
        }
        .build()
        return `_codesandbox-logo-light`!!
    }

private var `_codesandbox-logo-light`: ImageVector? = null
