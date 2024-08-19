package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Tabs-bold`: ImageVector
    get() {
        if (`_tabs-bold` != null) {
            return `_tabs-bold`!!
        }
        `_tabs-bold` = Builder(name = "Tabs-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.49f, 164.55f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, -0.06f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, false, 0.0f, -0.09f)
                lineTo(233.2f, 90.25f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 214.05f, 76.0f)
                horizontalLineTo(204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(7.07f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineTo(196.93f)
                lineTo(177.2f, 90.25f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 158.05f, 76.0f)
                horizontalLineTo(148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(7.07f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineTo(140.93f)
                lineTo(121.2f, 90.25f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 102.05f, 76.0f)
                horizontalLineTo(42.0f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 22.8f, 90.25f)
                lineTo(0.55f, 164.4f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, false, 0.0f, 0.09f)
                lineToRelative(0.0f, 0.06f)
                arcToRelative(5.68f, 5.68f, 0.0f, false, false, -0.16f, 0.62f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 180.0f)
                horizontalLineTo(244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.49f, -15.45f)
                close()
                moveTo(44.93f, 100.0f)
                horizontalLineTo(99.07f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineTo(28.13f)
                close()
            }
        }
        .build()
        return `_tabs-bold`!!
    }

private var `_tabs-bold`: ImageVector? = null
