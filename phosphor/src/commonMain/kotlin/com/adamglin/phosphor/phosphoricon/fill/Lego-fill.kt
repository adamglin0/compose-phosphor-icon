package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Lego-fill`: ImageVector
    get() {
        if (`_lego-fill` != null) {
            return `_lego-fill`!!
        }
        `_lego-fill` = Builder(name = "Lego-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.94f, 79.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.36f, -6.37f)
                lineTo(197.29f, 49.7f)
                curveTo(191.54f, 39.24f, 177.21f, 32.0f, 160.0f, 32.0f)
                curveToRelative(-22.43f, 0.0f, -40.0f, 12.3f, -40.0f, 28.0f)
                arcToRelative(20.77f, 20.77f, 0.0f, false, false, 1.06f, 6.53f)
                lineToRelative(-19.52f, 9.76f)
                arcTo(53.69f, 53.69f, 0.0f, false, false, 80.0f, 72.0f)
                curveToRelative(-22.43f, 0.0f, -40.0f, 12.3f, -40.0f, 28.0f)
                arcToRelative(20.77f, 20.77f, 0.0f, false, false, 1.06f, 6.53f)
                lineTo(12.42f, 120.84f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 128.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.42f, 7.16f)
                lineToRelative(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineToRelative(160.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 144.0f)
                verticalLineTo(80.0f)
                arcTo(4.54f, 4.54f, 0.0f, false, false, 247.94f, 79.21f)
                close()
                moveTo(80.0f, 151.06f)
                lineTo(33.89f, 128.0f)
                lineTo(51.0f, 119.45f)
                curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29.0f, 8.55f)
                curveToRelative(22.43f, 0.0f, 40.0f, -12.3f, 40.0f, -28.0f)
                arcToRelative(21.77f, 21.77f, 0.0f, false, false, -4.35f, -12.88f)
                lineTo(131.0f, 79.45f)
                curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29.0f, 8.55f)
                curveToRelative(18.38f, 0.0f, 33.49f, -8.26f, 38.35f, -19.88f)
                lineTo(222.11f, 80.0f)
                close()
                moveTo(160.0f, 48.0f)
                curveToRelative(12.23f, 0.0f, 21.69f, 5.0f, 23.63f, 10.12f)
                curveToRelative(0.0f, 0.09f, 0.07f, 0.18f, 0.11f, 0.28f)
                arcTo(5.25f, 5.25f, 0.0f, false, true, 184.0f, 60.0f)
                curveToRelative(0.0f, 5.66f, -10.26f, 12.0f, -24.0f, 12.0f)
                curveToRelative(-9.66f, 0.0f, -17.6f, -3.14f, -21.46f, -7.0f)
                arcToRelative(6.92f, 6.92f, 0.0f, false, false, -0.86f, -0.93f)
                arcTo(6.66f, 6.66f, 0.0f, false, true, 136.0f, 60.0f)
                curveTo(136.0f, 54.34f, 146.26f, 48.0f, 160.0f, 48.0f)
                close()
                moveTo(80.0f, 88.0f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, true, 17.13f, 3.87f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, 1.0f, 0.56f)
                curveToRelative(3.69f, 2.21f, 5.87f, 5.0f, 5.87f, 7.57f)
                curveToRelative(0.0f, 5.66f, -10.26f, 12.0f, -24.0f, 12.0f)
                curveToRelative(-9.67f, 0.0f, -17.61f, -3.14f, -21.47f, -7.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.84f, -0.93f)
                arcTo(6.62f, 6.62f, 0.0f, false, true, 56.0f, 100.0f)
                curveTo(56.0f, 94.34f, 66.26f, 88.0f, 80.0f, 88.0f)
                close()
                moveTo(24.0f, 140.94f)
                lineToRelative(48.0f, 24.0f)
                verticalLineToRelative(46.12f)
                lineToRelative(-48.0f, -24.0f)
                close()
            }
        }
        .build()
        return `_lego-fill`!!
    }

private var `_lego-fill`: ImageVector? = null
