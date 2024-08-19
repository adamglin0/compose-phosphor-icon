package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Factory-fill`: ImageVector
    get() {
        if (`_factory-fill` != null) {
            return `_factory-fill`!!
        }
        `_factory-fill` = Builder(name = "Factory-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(224.0f, 136.0f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.09f, 0.0f, -0.14f)
                reflectiveCurveToRelative(0.0f, -0.29f, 0.0f, -0.43f)
                reflectiveCurveToRelative(0.0f, -0.28f, 0.0f, -0.41f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.0f, -0.15f)
                lineToRelative(-15.0f, -105.13f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 193.06f, 16.0f)
                lineTo(174.94f, 16.0f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 159.1f, 29.74f)
                lineToRelative(-11.56f, 80.91f)
                lineTo(108.8f, 81.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 88.0f)
                verticalLineToRelative(32.0f)
                lineTo(44.8f, 81.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 88.0f)
                lineTo(32.0f, 208.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(232.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(108.0f, 184.0f)
                lineTo(80.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(176.0f, 184.0f)
                lineTo(148.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(170.67f, 128.0f)
                lineTo(162.14f, 121.6f)
                lineTo(174.94f, 32.0f)
                horizontalLineToRelative(18.12f)
                lineToRelative(13.72f, 96.0f)
                close()
            }
        }
        .build()
        return `_factory-fill`!!
    }

private var `_factory-fill`: ImageVector? = null
