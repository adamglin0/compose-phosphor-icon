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

public val DuotoneGroup.`Detective-duotone`: ImageVector
    get() {
        if (`_detective-duotone` != null) {
            return `_detective-duotone`!!
        }
        `_detective-duotone` = Builder(name = "Detective-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(104.0f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 104.0f, 180.0f)
                close()
                moveTo(180.0f, 152.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 180.0f, 152.0f)
                close()
                moveTo(166.11f, 51.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.7f, -0.29f)
                lineTo(140.47f, 66.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -24.94f, 0.0f)
                lineTo(102.59f, 51.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.7f, 0.29f)
                lineTo(40.0f, 120.0f)
                lineTo(216.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 112.0f)
                lineTo(220.08f, 112.0f)
                lineToRelative(-47.5f, -65.41f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.31f, -0.72f)
                lineToRelative(-12.85f, 14.9f)
                lineToRelative(-0.2f, 0.23f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -12.44f, 0.0f)
                lineToRelative(-0.2f, -0.23f)
                lineToRelative(-12.85f, -14.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.31f, 0.72f)
                lineTo(35.92f, 112.0f)
                lineTo(8.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(248.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(96.34f, 56.0f)
                lineToRelative(0.19f, 0.24f)
                lineToRelative(12.85f, 14.89f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 37.24f, 0.0f)
                lineToRelative(12.85f, -14.89f)
                curveToRelative(0.06f, -0.08f, 0.1f, -0.16f, 0.17f, -0.24f)
                lineToRelative(40.66f, 56.0f)
                lineTo(55.69f, 112.0f)
                close()
                moveTo(180.0f, 144.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -35.77f, 32.0f)
                lineTo(111.77f, 176.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -1.83f, 16.0f)
                horizontalLineToRelative(36.12f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 180.0f, 144.0f)
                close()
                moveTo(76.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 200.0f)
                close()
                moveTo(180.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 180.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_detective-duotone`!!
    }

private var `_detective-duotone`: ImageVector? = null
