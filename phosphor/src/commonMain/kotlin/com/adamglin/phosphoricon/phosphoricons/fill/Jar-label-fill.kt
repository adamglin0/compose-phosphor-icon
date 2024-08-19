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

public val FillGroup.`Jar-label-fill`: ImageVector
    get() {
        if (`_jar-label-fill` != null) {
            return `_jar-label-fill`!!
        }
        `_jar-label-fill` = Builder(name = "Jar-label-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 48.81f)
                lineTo(184.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(88.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 32.0f)
                lineTo(72.0f, 48.81f)
                arcTo(40.05f, 40.05f, 0.0f, false, false, 40.0f, 88.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(216.0f, 88.0f)
                arcTo(40.05f, 40.05f, 0.0f, false, false, 184.0f, 48.81f)
                close()
                moveTo(168.0f, 48.0f)
                lineTo(152.0f, 48.0f)
                lineTo(152.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(120.0f, 48.0f)
                lineTo(120.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                lineTo(136.0f, 48.0f)
                close()
                moveTo(104.0f, 32.0f)
                lineTo(104.0f, 48.0f)
                lineTo(88.0f, 48.0f)
                lineTo(88.0f, 32.0f)
                close()
                moveTo(80.0f, 64.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                lineTo(56.0f, 96.0f)
                lineTo(56.0f, 88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 64.0f)
                close()
                moveTo(176.0f, 224.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                lineTo(200.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_jar-label-fill`!!
    }

private var `_jar-label-fill`: ImageVector? = null
