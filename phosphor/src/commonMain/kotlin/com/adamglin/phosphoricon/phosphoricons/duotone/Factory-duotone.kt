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

public val DuotoneGroup.`Factory-duotone`: ImageVector
    get() {
        if (`_factory-duotone` != null) {
            return `_factory-duotone`!!
        }
        `_factory-duotone` = Builder(name = "Factory-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 136.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(88.0f)
                lineToRelative(64.0f, 48.0f)
                verticalLineTo(88.0f)
                lineToRelative(64.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 176.0f)
                close()
                moveTo(176.0f, 168.0f)
                lineTo(148.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(240.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(32.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineTo(96.0f, 120.0f)
                lineTo(96.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(38.74f, 29.05f)
                lineTo(159.1f, 29.74f)
                arcTo(16.08f, 16.08f, 0.0f, false, true, 174.94f, 16.0f)
                horizontalLineToRelative(18.12f)
                arcTo(16.08f, 16.08f, 0.0f, false, true, 208.9f, 29.74f)
                lineToRelative(15.0f, 105.13f)
                reflectiveCurveToRelative(0.08f, 0.78f, 0.08f, 1.13f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 216.0f)
                close()
                moveTo(162.14f, 121.6f)
                lineTo(170.67f, 128.0f)
                horizontalLineToRelative(36.11f)
                lineTo(193.06f, 32.0f)
                lineTo(174.94f, 32.0f)
                close()
                moveTo(48.0f, 208.0f)
                lineTo(208.0f, 208.0f)
                lineTo(208.0f, 144.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.8f, -1.6f)
                lineToRelative(-14.4f, -10.8f)
                lineToRelative(0.0f, 0.0f)
                lineTo(112.0f, 104.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 6.4f)
                lineTo(48.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_factory-duotone`!!
    }

private var `_factory-duotone`: ImageVector? = null
