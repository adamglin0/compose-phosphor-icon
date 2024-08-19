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

public val FillGroup.`Caret-circle-double-up-fill`: ImageVector
    get() {
        if (`_caret-circle-double-up-fill` != null) {
            return `_caret-circle-double-up-fill`!!
        }
        `_caret-circle-double-up-fill` = Builder(name = "Caret-circle-double-up-fill", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.58f, 54.43f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.14f)
                arcTo(104.17f, 104.17f, 0.0f, false, false, 201.58f, 54.43f)
                close()
                moveTo(165.68f, 173.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(128.0f, 147.32f)
                lineToRelative(-26.35f, 26.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 165.68f, 173.68f)
                close()
                moveTo(165.68f, 117.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(128.0f, 91.29f)
                lineToRelative(-26.35f, 26.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 165.68f, 117.65f)
                close()
            }
        }
        .build()
        return `_caret-circle-double-up-fill`!!
    }

private var `_caret-circle-double-up-fill`: ImageVector? = null
