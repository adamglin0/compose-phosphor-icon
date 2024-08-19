package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Umbrella-duotone`: ImageVector
    get() {
        if (`_umbrella-duotone` != null) {
            return `_umbrella-duotone`!!
        }
        `_umbrella-duotone` = Builder(name = "Umbrella-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                reflectiveCurveTo(88.0f, 64.0f, 88.0f, 136.0f)
                lineTo(32.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.71f)
                arcTo(104.21f, 104.21f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(232.0f, 127.29f)
                arcTo(104.21f, 104.21f, 0.0f, false, false, 128.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, 32.0f, 40.0f, 104.0f)
                horizontalLineToRelative(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 127.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 126.63f)
                arcTo(112.44f, 112.44f, 0.0f, false, false, 51.75f, 53.75f)
                arcToRelative(111.56f, 111.56f, 0.0f, false, false, -35.7f, 72.88f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 144.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(136.0f, 144.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -17.37f)
                close()
                moveTo(32.0f, 128.0f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(96.15f, 96.15f, 0.0f, false, true, 76.2f, -85.89f)
                curveTo(96.48f, 58.0f, 81.85f, 86.11f, 80.17f, 128.0f)
                close()
                moveTo(96.15f, 128.0f)
                curveToRelative(1.39f, -30.77f, 10.53f, -52.81f, 18.3f, -66.24f)
                arcTo(106.44f, 106.44f, 0.0f, false, true, 128.0f, 43.16f)
                arcToRelative(106.31f, 106.31f, 0.0f, false, true, 13.52f, 18.6f)
                curveTo(154.8f, 84.7f, 159.0f, 109.28f, 159.82f, 128.0f)
                close()
                moveTo(175.8f, 128.0f)
                curveToRelative(-1.68f, -41.89f, -16.31f, -70.0f, -28.0f, -85.94f)
                arcTo(96.07f, 96.07f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_umbrella-duotone`!!
    }

private var `_umbrella-duotone`: ImageVector? = null
