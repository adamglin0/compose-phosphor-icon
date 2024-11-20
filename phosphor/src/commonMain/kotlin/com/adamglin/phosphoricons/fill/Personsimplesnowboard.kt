package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) {
            return _personSimpleSnowboard!!
        }
        _personSimpleSnowboard = Builder(name = "PersonSimpleSnowboard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 52.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 136.0f, 52.0f)
                close()
                moveTo(223.67f, 122.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.93f, 5.42f)
                lineToRelative(-79.07f, -23.26f)
                lineToRelative(-7.78f, 11.67f)
                lineToRelative(35.33f, 10.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.42f, 12.14f)
                lineToRelative(-19.75f, 29.44f)
                lineToRelative(50.89f, 14.75f)
                arcTo(25.32f, 25.32f, 0.0f, false, true, 216.0f, 206.81f)
                arcTo(25.28f, 25.28f, 0.0f, false, true, 190.79f, 232.0f)
                arcToRelative(25.88f, 25.88f, 0.0f, false, true, -7.14f, -1.0f)
                lineTo(26.21f, 185.35f)
                arcTo(25.32f, 25.32f, 0.0f, false, true, 8.0f, 161.18f)
                arcTo(25.25f, 25.25f, 0.0f, false, true, 40.34f, 137.0f)
                lineToRelative(44.73f, 13.0f)
                lineToRelative(33.52f, -50.28f)
                lineToRelative(-40.85f, -12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.52f, -15.35f)
                lineToRelative(136.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.67f, 122.25f)
                close()
                moveTo(117.58f, 130.0f)
                lineToRelative(-16.4f, 24.6f)
                lineToRelative(29.58f, 8.58f)
                lineToRelative(16.49f, -24.59f)
                close()
            }
        }
        .build()
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
