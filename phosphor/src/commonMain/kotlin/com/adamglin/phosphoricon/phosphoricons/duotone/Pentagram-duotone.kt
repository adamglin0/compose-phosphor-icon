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

public val DuotoneGroup.`Pentagram-duotone`: ImageVector
    get() {
        if (`_pentagram-duotone` != null) {
            return `_pentagram-duotone`!!
        }
        `_pentagram-duotone` = Builder(name = "Pentagram-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(228.69f, 102.47f)
                lineToRelative(-54.21f, 39.0f)
                lineToRelative(20.77f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.31f, 8.95f)
                lineTo(128.0f, 174.91f)
                lineTo(73.06f, 214.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.31f, -8.95f)
                lineToRelative(20.77f, -64.0f)
                lineToRelative(-54.21f, -39.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 88.0f)
                horizontalLineTo(98.87f)
                lineToRelative(21.52f, -66.32f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 15.22f, 0.0f)
                lineTo(157.13f, 88.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 228.69f, 102.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.2f, 91.06f)
                arcTo(15.76f, 15.76f, 0.0f, false, false, 224.0f, 80.0f)
                horizontalLineToRelative(-61.0f)
                lineToRelative(-19.7f, -60.74f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -30.46f, -0.05f)
                lineTo(93.06f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.38f, 29.0f)
                lineToRelative(49.47f, 35.59f)
                lineTo(53.14f, 203.0f)
                arcTo(15.77f, 15.77f, 0.0f, false, false, 59.0f, 220.91f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, false, 18.78f, 0.0f)
                lineTo(128.0f, 184.77f)
                lineToRelative(50.24f, 36.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 202.86f, 203.0f)
                lineToRelative(-19.0f, -58.46f)
                lineToRelative(49.5f, -35.62f)
                arcTo(15.76f, 15.76f, 0.0f, false, false, 239.2f, 91.06f)
                close()
                moveTo(128.0f, 24.15f)
                lineTo(146.12f, 80.0f)
                lineTo(109.88f, 80.0f)
                close()
                moveTo(32.0f, 96.0f)
                lineTo(87.87f, 96.0f)
                lineTo(77.3f, 128.58f)
                close()
                moveTo(68.36f, 208.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(17.39f, -53.59f)
                lineToRelative(28.55f, 20.54f)
                close()
                moveTo(90.93f, 138.43f)
                lineTo(104.69f, 96.0f)
                horizontalLineToRelative(46.62f)
                lineToRelative(13.76f, 42.39f)
                lineTo(128.0f, 165.06f)
                close()
                moveTo(187.64f, 208.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-45.91f, -33.0f)
                lineToRelative(28.55f, -20.54f)
                close()
                moveTo(178.7f, 128.62f)
                lineTo(168.13f, 96.0f)
                lineTo(224.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_pentagram-duotone`!!
    }

private var `_pentagram-duotone`: ImageVector? = null
