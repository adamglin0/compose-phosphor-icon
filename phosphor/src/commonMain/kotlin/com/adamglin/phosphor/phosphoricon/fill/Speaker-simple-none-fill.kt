package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Speaker-simple-none-fill`: ImageVector
    get() {
        if (`_speaker-simple-none-fill` != null) {
            return `_speaker-simple-none-fill`!!
        }
        `_speaker-simple-none-fill` = Builder(name = "Speaker-simple-none-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.52f, 24.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.43f, 0.88f)
                lineTo(85.25f, 80.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(85.25f)
                lineToRelative(69.84f, 54.31f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 160.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 163.52f, 24.81f)
                close()
            }
        }
        .build()
        return `_speaker-simple-none-fill`!!
    }

private var `_speaker-simple-none-fill`: ImageVector? = null
