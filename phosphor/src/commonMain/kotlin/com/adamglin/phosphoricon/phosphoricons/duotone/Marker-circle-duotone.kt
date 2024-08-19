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

public val DuotoneGroup.`Marker-circle-duotone`: ImageVector
    get() {
        if (`_marker-circle-duotone` != null) {
            return `_marker-circle-duotone`!!
        }
        `_marker-circle-duotone` = Builder(name = "Marker-circle-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 211.16f)
                close()
                moveTo(80.0f, 211.16f)
                close()
                moveTo(224.0f, 128.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 80.0f, 211.16f)
                lineTo(80.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(96.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(4.16f)
                lineToRelative(12.0f, -57.63f)
                curveToRelative(1.77f, -8.49f, 13.89f, -8.49f, 15.66f, 0.0f)
                lineToRelative(12.0f, 57.63f)
                lineTo(152.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(35.16f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(88.0f, 206.37f)
                lineTo(88.0f, 176.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(30.37f)
                arcTo(88.38f, 88.38f, 0.0f, false, true, 88.0f, 206.37f)
                close()
                moveTo(104.0f, 144.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                lineTo(104.0f, 160.0f)
                close()
                moveTo(118.0f, 128.0f)
                lineTo(128.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(10.0f, 48.0f)
                close()
                moveTo(190.22f, 190.23f)
                curveToRelative(-2.0f, 2.0f, -4.08f, 3.87f, -6.22f, 5.64f)
                lineTo(184.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.61f, -15.8f)
                lineTo(143.66f, 76.74f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -31.32f, 0.0f)
                lineTo(101.61f, 128.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 144.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(19.87f)
                curveToRelative(-2.14f, -1.77f, -4.22f, -3.64f, -6.22f, -5.64f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 124.44f, 0.0f)
                close()
            }
        }
        .build()
        return `_marker-circle-duotone`!!
    }

private var `_marker-circle-duotone`: ImageVector? = null
