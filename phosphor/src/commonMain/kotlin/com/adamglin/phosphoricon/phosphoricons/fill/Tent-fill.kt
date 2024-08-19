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

public val FillGroup.`Tent-fill`: ImageVector
    get() {
        if (`_tent-fill` != null) {
            return `_tent-fill`!!
        }
        `_tent-fill` = Builder(name = "Tent-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.31f, 188.75f)
                lineToRelative(-64.0f, -144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.31f, 4.75f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.12f)
                verticalLineToRelative(0.0f)
                lineTo(0.69f, 188.75f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 200.0f)
                lineTo(248.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.31f, -11.25f)
                close()
                moveTo(64.0f, 184.0f)
                lineTo(20.31f, 184.0f)
                lineTo(64.0f, 85.7f)
                close()
                moveTo(80.0f, 184.0f)
                lineTo(80.0f, 85.7f)
                lineTo(123.69f, 184.0f)
                close()
            }
        }
        .build()
        return `_tent-fill`!!
    }

private var `_tent-fill`: ImageVector? = null
