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

public val FillGroup.`Signpost-fill`: ImageVector
    get() {
        if (`_signpost-fill` != null) {
            return `_signpost-fill`!!
        }
        `_signpost-fill` = Builder(name = "Signpost-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 117.35f)
                lineTo(212.33f, 154.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.89f, 5.3f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 64.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(64.44f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 11.89f, 5.3f)
                lineTo(246.0f, 106.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 246.0f, 117.35f)
                close()
            }
        }
        .build()
        return `_signpost-fill`!!
    }

private var `_signpost-fill`: ImageVector? = null
