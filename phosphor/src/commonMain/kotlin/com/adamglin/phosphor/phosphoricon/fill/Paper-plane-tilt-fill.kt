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

public val FillGroup.`Paper-plane-tilt-fill`: ImageVector
    get() {
        if (`_paper-plane-tilt-fill` != null) {
            return `_paper-plane-tilt-fill`!!
        }
        `_paper-plane-tilt-fill` = Builder(name = "Paper-plane-tilt-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 44.34f)
                reflectiveCurveToRelative(0.0f, 0.1f, 0.0f, 0.15f)
                lineToRelative(-58.2f, 191.94f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, true, -14.0f, 11.51f)
                quadToRelative(-0.69f, 0.06f, -1.38f, 0.06f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, -14.42f, -9.15f)
                lineTo(107.0f, 164.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.77f, -4.58f)
                lineToRelative(57.92f, -57.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(96.43f, 148.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.58f, 0.77f)
                lineTo(17.08f, 112.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 2.49f, -29.8f)
                lineToRelative(191.94f, -58.2f)
                lineToRelative(0.15f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 231.4f, 44.34f)
                close()
            }
        }
        .build()
        return `_paper-plane-tilt-fill`!!
    }

private var `_paper-plane-tilt-fill`: ImageVector? = null
