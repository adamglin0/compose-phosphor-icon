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

public val FillGroup.`Person-arms-spread-fill`: ImageVector
    get() {
        if (`_person-arms-spread-fill` != null) {
            return `_person-arms-spread-fill`!!
        }
        `_person-arms-spread-fill` = Builder(name = "Person-arms-spread-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 36.0f)
                close()
                moveTo(227.6f, 92.57f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 212.0f, 80.0f)
                horizontalLineTo(44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.7f, 30.53f)
                lineToRelative(0.06f, 0.0f)
                lineToRelative(53.89f, 23.73f)
                lineToRelative(-21.92f, 83.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.9f, 20.91f)
                arcTo(15.83f, 15.83f, 0.0f, false, false, 84.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.44f, -9.06f)
                lineTo(128.0f, 180.0f)
                lineToRelative(29.58f, 51.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.07f, -13.35f)
                lineToRelative(-21.92f, -83.3f)
                lineToRelative(54.0f, -23.76f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 227.6f, 92.57f)
                close()
            }
        }
        .build()
        return `_person-arms-spread-fill`!!
    }

private var `_person-arms-spread-fill`: ImageVector? = null
