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

public val FillGroup.`Export-fill`: ImageVector
    get() {
        if (`_export-fill` != null) {
            return `_export-fill`!!
        }
        `_export-fill` = Builder(name = "Export-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 112.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 112.0f)
                close()
                moveTo(136.0f, 43.31f)
                lineToRelative(26.34f, 26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 93.66f, 69.66f)
                lineTo(120.0f, 43.31f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_export-fill`!!
    }

private var `_export-fill`: ImageVector? = null
