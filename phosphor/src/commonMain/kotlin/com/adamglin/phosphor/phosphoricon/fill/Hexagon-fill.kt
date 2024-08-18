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

public val FillGroup.`Hexagon-fill`: ImageVector
    get() {
        if (`_hexagon-fill` != null) {
            return `_hexagon-fill`!!
        }
        `_hexagon-fill` = Builder(name = "Hexagon-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -8.32f, 14.0f)
                lineToRelative(-88.0f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, true, -15.36f, 0.0f)
                lineToRelative(-88.0f, -48.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -8.32f, -14.0f)
                verticalLineTo(80.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.32f, -14.0f)
                lineToRelative(88.0f, -48.17f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, true, 15.36f, 0.0f)
                lineToRelative(88.0f, 48.17f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 80.18f)
                close()
            }
        }
        .build()
        return `_hexagon-fill`!!
    }

private var `_hexagon-fill`: ImageVector? = null
